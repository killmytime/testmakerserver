package com.killmytime.testmakerserver.domain;

import org.springframework.data.repository.CrudRepository;

public interface KnowledgePointRepository extends CrudRepository<KnowledgePoint,Long> {
    public KnowledgePoint getKnowledgePointById(int id);
}
