package io.github.jokoframework.porandu.repositories;

import io.github.jokoframework.porandu.entities.VoteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author agimenez
 */
public interface VotesRepository extends JpaRepository<VoteEntity, Long> {

    List<VoteEntity> findByUserUserId(Long userId);

    VoteEntity getByQuestionQuestionIdAndUserUserId(Long questionId, Long userId);

    Long countByQuestionQuestionId(Long questionId);
}
