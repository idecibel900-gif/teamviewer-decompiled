package o;

import com.teamviewer.commonviewmodel.swig.AccountLoginErrorResultCallback;

/* JADX INFO: loaded from: classes.dex */
public final class ii8 extends AccountLoginErrorResultCallback {
    public final /* synthetic */ j68 a;
    public final /* synthetic */ bi8 b;
    public final /* synthetic */ ai8 c;
    public final /* synthetic */ bi8 d;
    public final /* synthetic */ ai8 e;

    public ii8(j68 j68Var, bi8 bi8Var, ai8 ai8Var, bi8 bi8Var2, ai8 ai8Var2) {
        this.a = j68Var;
        this.b = bi8Var;
        this.c = ai8Var;
        this.d = bi8Var2;
        this.e = ai8Var2;
    }

    @Override // com.teamviewer.commonviewmodel.swig.AccountLoginErrorResultCallback
    public final void OnAccountDeviceLimitExceeded() {
        this.c.a();
    }

    @Override // com.teamviewer.commonviewmodel.swig.AccountLoginErrorResultCallback, com.teamviewer.commonviewmodel.swig.IAccountLoginErrorResultCallback
    public final void OnActivationExpired(String str) {
        str.getClass();
        this.d.invoke(str);
    }

    @Override // com.teamviewer.commonviewmodel.swig.AccountLoginErrorResultCallback
    public final void OnGenericError(String str) {
        str.getClass();
        this.b.invoke(str);
    }

    @Override // com.teamviewer.commonviewmodel.swig.AccountLoginErrorResultCallback
    public final void OnSuccess() {
        this.a.a();
    }

    @Override // com.teamviewer.commonviewmodel.swig.AccountLoginErrorResultCallback
    public final void OnWrongEmailOrPasswordError() {
        this.e.a();
    }
}
