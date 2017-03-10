package com.jones;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIExamples {

	public static void main(String[] args) {
		new StreamAPIExamples().checkLocal();
	}

	private void checkLocal() {
		Stream<Locale> locales = Stream.of(Locale.getAvailableLocales());

		Map<String, List<Locale>> countryToLocales = locales.collect(Collectors.groupingBy(Locale::getCountry));

		List<Locale> swissLocales = countryToLocales.get("RS");
		swissLocales.stream().forEach(System.out::println);

		Map<Boolean, List<Locale>> englishAndOtherLocales = locales
				.collect(Collectors.partitioningBy(l -> l.getLanguage().equals("en")));
		List<Locale> englishLocales = englishAndOtherLocales.get(true);
		
		
/*		Map<String, Optional<String>> stateToLongestCityName = cities.collect(
				groupingBy(City::getState,
				mapping(City::getName,
				maxBy(Comparator.comparing(String::length)))));
*/		
	}

}
