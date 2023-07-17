package it.polito.tdp.exam.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jgrapht.Graphs;
import org.jgrapht.graph.DefaultWeightedEdge;

import org.jgrapht.graph.SimpleWeightedGraph;


import it.polito.tdp.exam.db.BaseballDAO;


public class Model {
	private Map<String, String > idMap;
	private BaseballDAO dao;
	private SimpleWeightedGraph<Integer, DefaultWeightedEdge> grafo;
	
	public Model() {
		idMap = new HashMap<String ,String>();
		this.grafo = new SimpleWeightedGraph<>(DefaultWeightedEdge.class) ;
		dao = new BaseballDAO();
		
	}
	
	
	
	public void creaGrafo(String nomeS) {
		List<Integer> anni = this.dao.getAnniDiGioco(nomeS);
		Graphs.addAllVertices(this.grafo, anni);
		
		
		for( Integer anno1 : this.grafo.vertexSet()) {
			
			for( Integer anno2 : this.grafo.vertexSet()) {
				if( anno1 != anno2) {
					int peso = this.dao.getPeso(nomeS, anno1, anno2);
					Graphs.addEdgeWithVertices(this.grafo, anno1, anno2, peso);
				}
				
			}
		}
		
	}
	
	public List<Integer> getAnni(){
		List<Integer> result = new ArrayList<>(  this.grafo.vertexSet());
		return result;
	}
	
	
	public List<Adiacenti> getAdiacenti(Integer anno) {
		List<Integer> anni = Graphs.neighborListOf(this.grafo, anno);
		List<Adiacenti> result = new ArrayList<>();
		
		for( Integer i : anni) {
			DefaultWeightedEdge e = this.grafo.getEdge(anno, i);
			int peso = (int) this.grafo.getEdgeWeight(e);
			result.add(new Adiacenti( anno, i, peso));
			
		}
		
		Collections.sort(result);
		return result;
	}
	
	
	
	public void ClearGrafo() {
		idMap = new HashMap<String ,String>();
		this.grafo = new SimpleWeightedGraph<>(DefaultWeightedEdge.class) ;
		dao = new BaseballDAO();
	}
	
	
	public int getnVertici( ) {
		return this.grafo.vertexSet().size();
	}
	
	
	public int getnARchi() {
		return this.grafo.edgeSet().size();
	}
	
	public List<String> getNomiSquadre(){
		return this.dao.readTeamName();
		
	}
}
