package com.productmanagment.mebel.modul;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import lombok.experimental.FieldDefaults;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@FieldDefaults(level= AccessLevel.PRIVATE)
public class Product {
  @Id
  int id;
  String name;
  double price;
  boolean isNew;

}
