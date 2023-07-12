package com.jblog.openapiexample.handler;

import com.jblog.openapiexample.api.TaskApiDelegate;
import com.jblog.openapiexample.model.CreateTaskRequest;
import com.jblog.openapiexample.model.CreateTaskResponse;
import com.jblog.openapiexample.model.Task;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Slf4j
@Service
public class TaskHandler implements TaskApiDelegate {

    @Override
    public ResponseEntity<CreateTaskResponse> createTask(CreateTaskRequest createTaskRequest) {
        log.info("Handling create task request");
        return ResponseEntity.ok(new CreateTaskResponse(UUID.randomUUID().toString()));
    }

    @Override
    public ResponseEntity<List<Task>> getTasks(String name, Integer priority) {
        log.info("Handling get tasks request");
        return ResponseEntity.ok(List.of(new Task(UUID.randomUUID().toString(), "Task Name", 1)));
    }
}
