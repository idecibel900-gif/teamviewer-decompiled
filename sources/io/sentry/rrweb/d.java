package io.sentry.rrweb;

import io.sentry.g1;
import io.sentry.t2;
import io.sentry.x3;

/* JADX INFO: loaded from: classes.dex */
public enum d implements t2 {
    Mutation,
    MouseMove,
    MouseInteraction,
    Scroll,
    ViewportResize,
    Input,
    TouchMove,
    MediaInteraction,
    StyleSheetRule,
    CanvasMutation,
    Font,
    Log,
    Drag,
    StyleDeclaration,
    Selection,
    AdoptedStyleSheet,
    CustomElement;

    @Override // io.sentry.t2
    public void serialize(x3 x3Var, g1 g1Var) {
        ((io.sentry.internal.debugmeta.c) x3Var).w(ordinal());
    }
}
