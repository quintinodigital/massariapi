package br.com.quintinodigital.massariapi.service;

import br.com.quintinodigital.massariapi.entity.PessoaEntity;

import java.util.ArrayList;
import java.util.List;

public class PessoaService implements PessoaInterfaceService {

    private static List<PessoaEntity> pessoaEntityList = new ArrayList<>();
    private static Long interador = 1L;

    @Override
    public PessoaEntity saveOne(PessoaEntity pessoaEntity) {
        pessoaEntity.setCodigo(interador++);
        PessoaEntity pessoa = new PessoaEntity(pessoaEntity);
        this.pessoaEntityList.add(pessoa);
        return pessoa;
    }

    @Override
    public List<PessoaEntity> findAll() {
        return this.pessoaEntityList;
    }

}