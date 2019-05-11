package com.killmytime.testmakerserver.domain;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PaperRepository extends CrudRepository<Paper,Long> {
    public Paper getPaperById(int id);
}
