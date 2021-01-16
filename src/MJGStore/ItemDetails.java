/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MJGStore;

import java.util.StringTokenizer;

/**
 *
 * @author nizar
 */
public class ItemDetails {
    String itemCode;
    String itemName;
    String brand;
    String price;
    int totalQty;
    int availQty;
    
    public ItemDetails(String itemCode, String itemName, String brand, String price, int totalQty, int availQty){
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.brand = brand;
        this.price = price;
        this.totalQty = totalQty;
        this.availQty = availQty;
    }
    
    public ItemDetails(String line){
        StringTokenizer st = new StringTokenizer(line,";");
        this.itemCode = st.nextToken();
        this.itemName = st.nextToken();
        this.brand = st.nextToken();
        this.price  = st.nextToken();
        this.totalQty = Integer.parseInt(st.nextToken());
        this.availQty = Integer.parseInt(st.nextToken());
    }

    public String getItemCode() {
        return itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public String getBrand() {
        return brand;
    }

    public String getPrice() {
        return price;
    }

    public int getTotalQty() {
        return totalQty;
    }

    public int getAvailQty() {
        return availQty;
    }
    
}
