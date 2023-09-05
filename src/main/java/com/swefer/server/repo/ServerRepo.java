package com.swefer.server.repo;

import com.swefer.server.model.Server;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface ServerRepo extends JpaRepository<Server, Long> {
 Server findByIpAddress(String ipAddress);
}
