import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.junit.Assert.assertThat;

/**
 * Interesting additions to Map-interface
 * Map.merge
 * Map.compute
 * Map.putIfAbsent
 * Map.getOrDefault
 * ...
 */
public class MapAdditions {

	@Test
	public void map_merge() {
		Map<String, Integer> map = new HashMap<>();
		map.put("key1", 1);
		map.put("key2", 1);

		// Increment value the old way
		Integer counter = 1;
		if (map.containsKey("key1")) {
			counter = 1 + map.get("key1");
		}
		map.put("key1", counter);
		//

		incrementValue(map, "key2");
		incrementValue(map, "key3");

		assertThat(map.get("key1"), is(2));
		assertThat(map.get("key2"), is(2));
		assertThat(map.get("key3"), is(1));
	}

	private void incrementValue(Map<String, Integer> map, String key) {
		/*
			map.merge(key, 1, (value, newValue) -> value + newValue);
		*/
		throw new RuntimeException("Implement");
	}

	@Test
	public void map_compute_if_absent() {
		Map<Integer, List<String>> map = new HashMap<>();

		// Collect in map grouped by string length
		String s1 = "java";
		if (!map.containsKey(s1.length())) {
			map.put(s1.length(), new ArrayList());
		}
		map.get(s1.length()).add(s1);

		groupByStringLength(map, "scala");
		groupByStringLength(map, "ruby");

		assertThat(map.get(4), hasSize(2));
		assertThat(map.get(5), hasSize(1));
	}

	private void groupByStringLength(Map<Integer, List<String>> map, String string) {
		/*
			map.computeIfAbsent(string.length(), (key) -> new ArrayList<>())
					.add(string);
		*/

		throw new RuntimeException("Implement");
	}


}
