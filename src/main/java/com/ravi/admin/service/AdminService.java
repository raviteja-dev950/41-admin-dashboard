package com.ravi.admin.service;
import com.ravi.admin.model.Stat;
import org.springframework.stereotype.Service;
import java.util.*;
@Service
public class AdminService {
    public List<Stat> getStats(){
        return Arrays.asList(
            new Stat("Total Users", "1,254", "people", "primary"),
            new Stat("Total Products", "342", "box-seam", "success"),
            new Stat("Total Orders", "1,089", "cart-check", "warning"),
            new Stat("Revenue", "₹12.4L", "currency-rupee", "danger")
        );
    }
    public List<Map<String,String>> getRecentUsers(){
        List<Map<String,String>> list = new ArrayList<>();
        list.add(Map.of("id","#U101","name","Ravi Teja","email","ravi@gmail.com","role","Admin","status","Active"));
        list.add(Map.of("id","#U102","name","Priya Sharma","email","priya@gmail.com","role","User","status","Active"));
        list.add(Map.of("id","#U103","name","Amit Kumar","email","amit@gmail.com","role","Seller","status","Pending"));
        list.add(Map.of("id","#U104","name","Sneha Rao","email","sneha@gmail.com","role","User","status","Active"));
        list.add(Map.of("id","#U105","name","Vikram Singh","email","vikram@gmail.com","role","User","status","Blocked"));
        return list;
    }
    public List<Map<String,String>> getRecentOrders(){
        List<Map<String,String>> list = new ArrayList<>();
        list.add(Map.of("id","#ORD-501","customer","Ravi Teja","product","iPhone 15 Pro Max","amount","₹1,34,900","status","Delivered"));
        list.add(Map.of("id","#ORD-502","customer","Priya S","product","MacBook Air M3","amount","₹1,14,900","status","Shipped"));
        list.add(Map.of("id","#ORD-503","customer","Amit K","product","Sony WH-1000XM5","amount","₹29,990","status","Pending"));
        list.add(Map.of("id","#ORD-504","customer","Sneha R","product","Nike Air Jordan","amount","₹12,995","status","Delivered"));
        list.add(Map.of("id","#ORD-505","customer","Vikram S","product","Apple Watch Ultra 2","amount","₹89,900","status","Processing"));
        return list;
    }
    public List<Map<String,String>> getProductList(){
        List<Map<String,String>> list = new ArrayList<>();
        list.add(Map.of("id","#P01","name","iPhone 15 Pro Max","category","Mobile","price","₹1,34,900","stock","45"));
        list.add(Map.of("id","#P02","name","MacBook Air M3","category","Laptop","price","₹1,14,900","stock","12"));
        list.add(Map.of("id","#P03","name","Sony WH-1000XM5","category","Audio","price","₹29,990","stock","78"));
        list.add(Map.of("id","#P04","name","Nike Air Jordan","category","Shoes","price","₹12,995","stock","120"));
        list.add(Map.of("id","#P05","name","Apple Watch Ultra 2","category","Wearable","price","₹89,900","stock","34"));
        return list;
    }
}