package edu.xjtu.cdl2bpel.common;

public interface MyArtifactManager {

	public MyArtifact[] getArtifacts(String component, String category,
			String artifactType) throws MyArtifactException;

}
