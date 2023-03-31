package com.app.pojo;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Product extends Base {
	private String productName;
}
