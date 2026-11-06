package com.google.firebase.components;

import java.util.List;
import o.gk0;

/* JADX INFO: loaded from: classes.dex */
public interface ComponentRegistrarProcessor {
    public static final ComponentRegistrarProcessor NOOP = new gk0(11);

    List<Component<?>> processRegistrar(ComponentRegistrar componentRegistrar);
}
