package com.solstice.washcar_newcar.data.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.solstice.washcar_newcar.data.entity.Menu;

import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class MenuDto {
  private String whattimeCalendarCode;

  public Menu toEntity() {
    return Menu.builder()
        .whattimeCalendarCode(this.whattimeCalendarCode)
        .build();
  }
}