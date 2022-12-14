package com.woody.plm.drawing.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.querydsl.core.annotations.QueryProjection;
import java.time.LocalDateTime;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class DrawingDto {


  @JsonProperty("drawingId")
  private Long id;
  private String drawingNo;
  private String drawingName;
  private String drafter;

  private Long version;

  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
  private LocalDateTime modifiedDate;

  @QueryProjection
  public DrawingDto(Long id, String drawingNo, String drawingName, String drafter, Long version,
      LocalDateTime modifiedDate) {
    this.id = id;
    this.drawingNo = drawingNo;
    this.drawingName = drawingName;
    this.drafter = drafter;
    this.version = version;
    this.modifiedDate = modifiedDate;
  }
}
