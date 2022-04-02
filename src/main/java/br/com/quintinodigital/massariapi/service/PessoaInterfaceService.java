package br.com.quintinodigital.massariapi.service;

import br.com.quintinodigital.massariapi.entity.PessoaEntity;

import java.util.List;

public interface PessoaInterfaceService {
    public List<PessoaEntity> findAll();
    public PessoaEntity saveOne(PessoaEntity pessoaEntity);
}
