package de.otto.teamdojo.repository;

import de.otto.teamdojo.domain.LevelSkill;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.*;

/**
 * Spring Data JPA repository for the LevelSkill entity.
 */
@SuppressWarnings("unused")
@Repository
public interface LevelSkillRepository extends JpaRepository<LevelSkill, Long>, JpaSpecificationExecutor<LevelSkill> {

}
