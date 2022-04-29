package com.rekemuz.reconnnection;

import com.kemuz.kemspring.model.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SpringFall {
    @GetMapping("/students1/all")
    public ResponseEntity getAll(){
        List<Object> list = new ArrayList<>();
        list.add(new modelOfStudents
                (1L,"name",
                        "surname",
                        "fathername",
                        "Java",
                        1,
                        "Java Back-end"));
//        list.add(new modelOfStudents());
//        list.add(new modelOfStudents());
//        list.add(new modelOfStudents());
        return ResponseEntity.ok(list);
    }
}
