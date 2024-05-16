package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
	
	@GetMapping("/weather")
	public WeatherReport getWeather() {
		WeatherReport report = new WeatherReport();
		report.setHeadlineText("ヘッドラインです");
		report.setPublishingOffice("やゆよ天文台");
		report.setTargetArea("日本");
		report.setText("本日は晴天");
		return report;
	}
	
	@GetMapping("/weather/{areacode}")
	public WeatherReport getWeather(@PathVariable String areacode) {
		WeatherReport report = new WeatherReport();
		report.setHeadlineText("ヘッドラインです");
		report.setPublishingOffice("やゆよ天文台");
		report.setTargetArea("areacodeは" + areacode + "番です");
		report.setText("本日は晴天");
		return report;
	}
	
	@PostMapping("/weather/{areacode}")
	public WeatherReport postWeather(@RequestParam String areacode) {
		WeatherReport report = new WeatherReport();
		report.setHeadlineText("ヘッドラインです");
		report.setPublishingOffice("やゆよ天文台");
		report.setTargetArea("areacodeは" + areacode + "番です");
		report.setText("本日は晴天");
		return report;
	}
}
