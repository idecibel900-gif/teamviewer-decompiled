package o;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class uo1 implements so1 {
    public static final /* synthetic */ fw3[] Y;
    public final to1 A;
    public final to1 B;
    public final to1 C;
    public final to1 D;
    public final to1 E;
    public final to1 F;
    public final to1 G;
    public final to1 H;
    public final to1 I;
    public final to1 J;
    public final to1 K;
    public final to1 L;
    public final to1 M;
    public final to1 N;
    public final to1 O;
    public final to1 P;
    public final to1 Q;
    public final to1 R;
    public final to1 S;
    public final to1 T;
    public final to1 U;
    public final to1 V;
    public final to1 W;
    public final to1 X;
    public boolean a;
    public final to1 b = new to1(at0.d, this);
    public final to1 c;
    public final to1 d;
    public final to1 e;
    public final to1 f;
    public final to1 g;
    public final to1 h;
    public final to1 i;
    public final to1 j;
    public final to1 k;
    public final to1 l;
    public final to1 m;
    public final to1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final to1 f2232o;
    public final to1 p;
    public final to1 q;
    public final to1 r;
    public final to1 s;
    public final to1 t;
    public final to1 u;
    public final to1 v;
    public final to1 w;
    public final to1 x;
    public final to1 y;
    public final to1 z;

    static {
        x86 x86Var = w86.a;
        Y = new fw3[]{x86Var.e(new gx4(x86Var.b(uo1.class), "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;")), x86Var.e(new gx4(x86Var.b(uo1.class), "withDefinedIn", "getWithDefinedIn()Z")), x86Var.e(new gx4(x86Var.b(uo1.class), "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z")), x86Var.e(new gx4(x86Var.b(uo1.class), "modifiers", "getModifiers()Ljava/util/Set;")), x86Var.e(new gx4(x86Var.b(uo1.class), "startFromName", "getStartFromName()Z")), x86Var.e(new gx4(x86Var.b(uo1.class), "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z")), x86Var.e(new gx4(x86Var.b(uo1.class), "debugMode", "getDebugMode()Z")), x86Var.e(new gx4(x86Var.b(uo1.class), "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z")), x86Var.e(new gx4(x86Var.b(uo1.class), "verbose", "getVerbose()Z")), x86Var.e(new gx4(x86Var.b(uo1.class), "unitReturnType", "getUnitReturnType()Z")), x86Var.e(new gx4(x86Var.b(uo1.class), "withoutReturnType", "getWithoutReturnType()Z")), x86Var.e(new gx4(x86Var.b(uo1.class), "enhancedTypes", "getEnhancedTypes()Z")), x86Var.e(new gx4(x86Var.b(uo1.class), "normalizedVisibilities", "getNormalizedVisibilities()Z")), x86Var.e(new gx4(x86Var.b(uo1.class), "renderDefaultVisibility", "getRenderDefaultVisibility()Z")), x86Var.e(new gx4(x86Var.b(uo1.class), "renderDefaultModality", "getRenderDefaultModality()Z")), x86Var.e(new gx4(x86Var.b(uo1.class), "renderConstructorDelegation", "getRenderConstructorDelegation()Z")), x86Var.e(new gx4(x86Var.b(uo1.class), "renderPrimaryConstructorParametersAsProperties", "getRenderPrimaryConstructorParametersAsProperties()Z")), x86Var.e(new gx4(x86Var.b(uo1.class), "actualPropertiesInPrimaryConstructor", "getActualPropertiesInPrimaryConstructor()Z")), x86Var.e(new gx4(x86Var.b(uo1.class), "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z")), x86Var.e(new gx4(x86Var.b(uo1.class), "includePropertyConstant", "getIncludePropertyConstant()Z")), x86Var.e(new gx4(x86Var.b(uo1.class), "propertyConstantRenderer", "getPropertyConstantRenderer()Lkotlin/jvm/functions/Function1;")), x86Var.e(new gx4(x86Var.b(uo1.class), "withoutTypeParameters", "getWithoutTypeParameters()Z")), x86Var.e(new gx4(x86Var.b(uo1.class), "withoutSuperTypes", "getWithoutSuperTypes()Z")), x86Var.e(new gx4(x86Var.b(uo1.class), "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;")), x86Var.e(new gx4(x86Var.b(uo1.class), "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;")), x86Var.e(new gx4(x86Var.b(uo1.class), "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z")), x86Var.e(new gx4(x86Var.b(uo1.class), "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;")), x86Var.e(new gx4(x86Var.b(uo1.class), "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;")), x86Var.e(new gx4(x86Var.b(uo1.class), "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;")), x86Var.e(new gx4(x86Var.b(uo1.class), "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;")), x86Var.e(new gx4(x86Var.b(uo1.class), "receiverAfterName", "getReceiverAfterName()Z")), x86Var.e(new gx4(x86Var.b(uo1.class), "renderCompanionObjectName", "getRenderCompanionObjectName()Z")), x86Var.e(new gx4(x86Var.b(uo1.class), "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;")), x86Var.e(new gx4(x86Var.b(uo1.class), "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z")), x86Var.e(new gx4(x86Var.b(uo1.class), "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z")), x86Var.e(new gx4(x86Var.b(uo1.class), "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;")), x86Var.e(new gx4(x86Var.b(uo1.class), "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;")), x86Var.e(new gx4(x86Var.b(uo1.class), "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;")), x86Var.e(new gx4(x86Var.b(uo1.class), "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;")), x86Var.e(new gx4(x86Var.b(uo1.class), "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z")), x86Var.e(new gx4(x86Var.b(uo1.class), "renderConstructorKeyword", "getRenderConstructorKeyword()Z")), x86Var.e(new gx4(x86Var.b(uo1.class), "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z")), x86Var.e(new gx4(x86Var.b(uo1.class), "renderTypeExpansions", "getRenderTypeExpansions()Z")), x86Var.e(new gx4(x86Var.b(uo1.class), "renderAbbreviatedTypeComments", "getRenderAbbreviatedTypeComments()Z")), x86Var.e(new gx4(x86Var.b(uo1.class), "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z")), x86Var.e(new gx4(x86Var.b(uo1.class), "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z")), x86Var.e(new gx4(x86Var.b(uo1.class), "renderFunctionContracts", "getRenderFunctionContracts()Z")), x86Var.e(new gx4(x86Var.b(uo1.class), "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z")), x86Var.e(new gx4(x86Var.b(uo1.class), "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z")), x86Var.e(new gx4(x86Var.b(uo1.class), "informativeErrorType", "getInformativeErrorType()Z"))};
    }

    public uo1() {
        Boolean bool = Boolean.TRUE;
        this.c = new to1(bool, this);
        this.d = new to1(bool, this);
        this.e = new to1(ro1.n, this);
        Boolean bool2 = Boolean.FALSE;
        this.f = new to1(bool2, this);
        this.g = new to1(bool2, this);
        this.h = new to1(bool2, this);
        this.i = new to1(bool2, this);
        this.j = new to1(bool2, this);
        this.k = new to1(bool, this);
        this.l = new to1(bool2, this);
        this.m = new to1(bool2, this);
        this.n = new to1(bool2, this);
        this.f2232o = new to1(bool, this);
        this.p = new to1(bool, this);
        this.q = new to1(bool2, this);
        this.r = new to1(bool2, this);
        this.s = new to1(bool2, this);
        this.t = new to1(bool2, this);
        this.u = new to1(bool2, this);
        this.v = new to1(null, this);
        this.w = new to1(bool2, this);
        this.x = new to1(bool2, this);
        this.y = new to1(ek.D, this);
        this.z = new to1(ek.E, this);
        this.A = new to1(bool, this);
        this.B = new to1(fc5.n, this);
        this.C = new to1(oo1.a, this);
        this.D = new to1(qa6.m, this);
        this.E = new to1(tf5.m, this);
        this.F = new to1(bool2, this);
        this.G = new to1(bool2, this);
        this.H = new to1(au5.m, this);
        this.I = new to1(bool2, this);
        this.J = new to1(bool2, this);
        this.K = new to1(la2.m, this);
        this.L = new to1(qe2.a, this);
        this.M = new to1(null, this);
        this.N = new to1(bp.NO_ARGUMENTS, this);
        this.O = new to1(bool2, this);
        this.P = new to1(bool, this);
        this.Q = new to1(bool, this);
        this.R = new to1(bool2, this);
        this.S = new to1(bool2, this);
        this.T = new to1(bool, this);
        this.U = new to1(bool, this);
        this.V = new to1(bool2, this);
        this.W = new to1(bool2, this);
        this.X = new to1(bool, this);
    }

    @Override // o.so1
    public final void a() {
        fw3 fw3Var = Y[30];
        this.F.b(Boolean.TRUE, fw3Var);
    }

    @Override // o.so1
    public final void b() {
        fw3 fw3Var = Y[6];
        this.h.b(Boolean.TRUE, fw3Var);
    }

    @Override // o.so1
    public final void c() {
        fw3 fw3Var = Y[31];
        this.G.b(Boolean.TRUE, fw3Var);
    }

    @Override // o.so1
    public final void d(Set set) {
        set.getClass();
        this.e.b(set, Y[3]);
    }

    @Override // o.so1
    public final void e(LinkedHashSet linkedHashSet) {
        this.L.b(linkedHashSet, Y[36]);
    }

    @Override // o.so1
    public final void f() {
        fw3 fw3Var = Y[21];
        this.w.b(Boolean.TRUE, fw3Var);
    }

    @Override // o.so1
    public final void g(at0 at0Var) {
        this.b.b(at0Var, Y[0]);
    }

    @Override // o.so1
    public final void h() {
        fw3 fw3Var = Y[4];
        this.f.b(Boolean.TRUE, fw3Var);
    }

    @Override // o.so1
    public final void i() {
        fw3 fw3Var = Y[1];
        this.c.b(Boolean.FALSE, fw3Var);
    }

    @Override // o.so1
    public final Set j() {
        fw3 fw3Var = Y[36];
        to1 to1Var = this.L;
        to1Var.getClass();
        fw3Var.getClass();
        return (Set) to1Var.m;
    }

    @Override // o.so1
    public final void k() {
        this.D.b(qa6.n, Y[28]);
    }

    @Override // o.so1
    public final void l() {
        fw3 fw3Var = Y[22];
        this.x.b(Boolean.TRUE, fw3Var);
    }

    @Override // o.so1
    public final void m(tf5 tf5Var) {
        this.E.b(tf5Var, Y[29]);
    }

    public final bp n() {
        fw3 fw3Var = Y[38];
        to1 to1Var = this.N;
        to1Var.getClass();
        fw3Var.getClass();
        return (bp) to1Var.m;
    }

    public final boolean o() {
        fw3 fw3Var = Y[6];
        to1 to1Var = this.h;
        to1Var.getClass();
        fw3Var.getClass();
        return ((Boolean) to1Var.m).booleanValue();
    }
}
