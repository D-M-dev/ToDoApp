package com.example.todo;

import com.example.todo.repository.TodoRepository;
import com.example.todo.service.TodoService;
import com.example.todo.ui.ConsoleUI;

public class App {
    public static void main(String[] args) {
        TodoRepository repository = new TodoRepository();
        TodoService service = new TodoService(repository);
        ConsoleUI ui = new ConsoleUI(service);
        
        ui.start();
    }
}