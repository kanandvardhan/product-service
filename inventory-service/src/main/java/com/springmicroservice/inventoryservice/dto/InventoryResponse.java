package com.springmicroservice.inventoryservice.dto;

import com.springmicroservice.inventoryservice.repository.InventoryRepository;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class InventoryResponse {

    private String skuCode;
    private boolean isInStock;

}
