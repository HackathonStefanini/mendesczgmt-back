package com.stefanini.repository;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.Path;

import org.hibernate.annotations.FetchProfile.FetchOverride;

import com.stefanini.dao.GenericDAO;
import com.stefanini.entity.Jogador;

@ApplicationScoped
public class JogadorRepository extends GenericDAO<Jogador, Long> {
    
}
