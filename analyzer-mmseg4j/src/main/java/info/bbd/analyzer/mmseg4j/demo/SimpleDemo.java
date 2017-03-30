package info.bbd.analyzer.mmseg4j.demo;

import java.io.IOException;

import info.bbd.analyzer.mmseg4j.core.Seg;
import info.bbd.analyzer.mmseg4j.core.SimpleSeg;

public class SimpleDemo extends ComplexDemo {

	@Override
	protected Seg getSeg() {
		return new SimpleSeg(dic);
	}

	public static void main(String[] args) throws IOException {
		new SimpleDemo().run(args);
	}

}
