package org.booklore.crons;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.sql.init.dependency.DependsOnDatabaseInitialization;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@DependsOnDatabaseInitialization
@Slf4j
public class CronService {
}
