package org.nuist.privateblogbackend.service;

import org.nuist.privateblogbackend.vo.Result;
import org.nuist.privateblogbackend.vo.params.RegisterParam;

public interface RegisterService {
    Result register(RegisterParam registerParam);
}
