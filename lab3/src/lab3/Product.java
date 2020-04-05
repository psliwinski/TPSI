/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Lenovo
 */
public class Product {
    private Integer id; 
    private String name; 
    private String category;
    private Double price; 
    
    @Override
    public String toString() {
        return id + " " + name + " " + category + " " + price;
    }
    
    public Product(Integer id, String name, String category, Double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }
    
    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
    public String getCategory() {
        return this.category;
    }

    public Double getPrice() {
        return price;
    }

    public void setId(Integer Id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
