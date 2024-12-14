package com.internal.developer.platform.releases.worker;

import com.internal.developer.platform.releases.service.ReleaseService;
import java.util.concurrent.Callable;

public class ReleaseWorker implements Callable<Integer> {

	private ReleaseService releaseService;
	private String atom;

	public ReleaseWorker(ReleaseService releaseService, String atom) {
		this.releaseService = releaseService;
		this.atom = atom;
	}

	@Override
	public Integer call() throws Exception {
		return releaseService.releases(atom);
	}

}
