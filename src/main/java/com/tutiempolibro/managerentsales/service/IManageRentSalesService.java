package com.tutiempolibro.managerentsales.service;

import com.tutiempolibro.managerentsales.types.SummaryPurchaseType;

public interface IManageRentSalesService {
    
    public SummaryPurchaseType rentSalesBook(Integer suscriptionId, Integer shoppingId, Integer deliveryId, String direction, String reference, Boolean preview, String authorization);
    
}
