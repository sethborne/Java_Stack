package com.sethborne.assignmentthree.lookify.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sethborne.assignmentthree.lookify.models.Song;

@Repository

public interface SongRepository extends CrudRepository<Song, Long>{

}
