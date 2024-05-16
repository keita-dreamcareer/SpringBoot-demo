package com.example.demo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

public class WeatherReport {

    @JsonProperty("publishingOffice")
    private String publishingOffice;

    @JsonProperty("reportDatetime")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssXXX")
    private LocalDateTime reportDatetime;

    @JsonProperty("targetArea")
    private String targetArea;

    @JsonProperty("headlineText")
    private String headlineText;

    @JsonProperty("text")
    private String text;

    // Getters and setters
    public String getPublishingOffice() {
        return publishingOffice;
    }

    public void setPublishingOffice(String publishingOffice) {
        this.publishingOffice = publishingOffice;
    }

    public LocalDateTime getReportDatetime() {
        return reportDatetime;
    }

    public void setReportDatetime(LocalDateTime reportDatetime) {
        this.reportDatetime = reportDatetime;
    }

    public String getTargetArea() {
        return targetArea;
    }

    public void setTargetArea(String targetArea) {
        this.targetArea = targetArea;
    }

    public String getHeadlineText() {
        return headlineText;
    }

    public void setHeadlineText(String headlineText) {
        this.headlineText = headlineText;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    // toString method
    @Override
    public String toString() {
        return "WeatherReport{" +
                "publishingOffice='" + publishingOffice + '\'' +
                ", reportDatetime=" + reportDatetime +
                ", targetArea='" + targetArea + '\'' +
                ", headlineText='" + headlineText + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
