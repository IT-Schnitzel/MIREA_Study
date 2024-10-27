package org.example;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import java.util.List;
@Getter
@AllArgsConstructor
@ToString
public class Ex extends Exception {
    private int rem;
    private int ind;
}
