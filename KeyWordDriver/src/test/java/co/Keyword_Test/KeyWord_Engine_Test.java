package co.Keyword_Test;

import org.testng.annotations.Test;

import KeyWord_Engine.Keyword_Engine;

public class KeyWord_Engine_Test {
	Keyword_Engine engine;

	@Test
	public void startExecutions_Test() {
		engine = new Keyword_Engine();
		engine.startExecutions("Sheet1");
	}
}
