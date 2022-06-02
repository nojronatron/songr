package com.jonxample.songr;

import com.jonxample.songr.models.Album;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SongrApplicationTests {

	@Test
	void testAlbumModelConstructor() {
		String expectedTitle = "myTitle";
		String expectedArtist = "myArtist";
		int expectedSongCount = 8;
		float expectedLength = 200.567f;
		String expectedArtUrl = "./images";

		Album sut = new Album(
				expectedTitle,
				expectedArtist,
				expectedSongCount,
				expectedLength,
				expectedArtUrl
		);

		assertEquals(expectedTitle, sut.title, "Instantiated album should have the correct title");
		assertEquals(expectedArtist, sut.artist, "Instantiated album should have the correct artist");
		assertEquals(expectedSongCount, sut.songCount, "Instantiated album should have the correct song count");
		assertEquals(expectedLength, sut.length, "Instantiated album should have the correct album length");
		assertEquals(expectedArtUrl, sut.imageUrl, "Instantiated album should have the correct art path");
	}

}
