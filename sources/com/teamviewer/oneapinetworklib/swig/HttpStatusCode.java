package com.teamviewer.oneapinetworklib.swig;

import o.hk0;
import o.ua5;

/* JADX INFO: loaded from: classes.dex */
public enum HttpStatusCode {
    Continue(100),
    SwitchingProtocols(101),
    EarlyHints(103),
    Ok(200),
    Created(201),
    Accepted(202),
    NonAuthoritativeInformation(203),
    NoContent(204),
    ResetContent(205),
    PartialContent(206),
    MultiStatus(207),
    AlreadyReported(208),
    IMUsed(226),
    MultipleChoices(300),
    MovedPermanently(301),
    Found(302),
    SeeOther(303),
    NotModified(304),
    TemporaryRedirect(307),
    PermanentRedirect(308),
    BadRequest(400),
    Unauthorized(401),
    PaymentRequired(402),
    Forbidden(403),
    NotFound(404),
    MethodNotAllowed(405),
    NotAcceptable(406),
    ProxyAuthenticationRequired(407),
    RequestTimeout(408),
    Conflict(409),
    Gone(410),
    LengthRequired(411),
    PreconditionFailed(412),
    ContentTooLarge(413),
    UriTooLong(414),
    UnsupportedMediaType(415),
    RangeNotSatisfiable(416),
    ExpectationFailed(417),
    ImATeapot(418),
    MisdirectedRequest(421),
    UnprocessableContent(422),
    Locked(423),
    FailedDependency(424),
    TooEarly(425),
    UpgradeRequired(426),
    PreconditionRequired(428),
    TooManyRequests(429),
    RequestHeaderFieldsTooLarge(431),
    UnavailableForLegalReasons(451),
    InternalServerError(500),
    NotImplemented(501),
    BadGateway(502),
    ServiceUnavailable(503),
    GatewayTimeout(504),
    HttpVersionNotSupported(505),
    VariantAlsoNegotiates(506),
    InsufficientStorage(507),
    LoopDetected(508),
    NotExtended(510),
    NetworkAuthenticationRequired(511);

    private final int swigValue;

    public static class SwigNext {
        private static int next;

        private SwigNext() {
        }
    }

    HttpStatusCode() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    public static HttpStatusCode swigToEnum(int i) {
        HttpStatusCode[] httpStatusCodeArr = (HttpStatusCode[]) HttpStatusCode.class.getEnumConstants();
        if (i < httpStatusCodeArr.length && i >= 0) {
            HttpStatusCode httpStatusCode = httpStatusCodeArr[i];
            if (httpStatusCode.swigValue == i) {
                return httpStatusCode;
            }
        }
        for (HttpStatusCode httpStatusCode2 : httpStatusCodeArr) {
            if (httpStatusCode2.swigValue == i) {
                return httpStatusCode2;
            }
        }
        hk0.g(ua5.k(i, HttpStatusCode.class, "No enum ", " with value "));
        return null;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    HttpStatusCode(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    HttpStatusCode(HttpStatusCode httpStatusCode) {
        int i = httpStatusCode.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
