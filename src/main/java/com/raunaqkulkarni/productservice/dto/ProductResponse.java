package com.raunaqkulkarni.productservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponse {

        @Id
        private String id;
        private String name;
        private String description;
        private String price;
}
