package com.rekemuz.reconnnection;

import com.kemuz.kemspring.model.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SpringFall {
        @GetMapping("/students/all")
        public ResponseEntity getAll() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("add id: ");
            Long id = scanner.nextLong();
            System.out.print("add name: ");
            String name = scanner.nextLine();
            System.out.print("add lastname: ");
            String lastName = scanner.nextLine();
            System.out.print("add father_name: ");
            String father_Name = scanner.nextLine();
            System.out.print("add class: ");
            int _class = scanner.nextInt();
            System.out.print("add course: ");
            String course = scanner.nextLine();
            List<Object> list = new ArrayList<>();
            list.add(new Student(id,name,lastName,course));
            return ResponseEntity.ok(list);
        }
}
