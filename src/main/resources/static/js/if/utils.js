$(function () {
    // initLoding()
})

var util = {
    info: function(message) {
        $.notify({
            icon: "add_alert",
            message: message
        }, {
            type: "info",
            timer: 1000
        });
    },
    danger: function(message) {
        $.notify({
            icon: "add_alert",
            message: message
        }, {
            type: "danger",
            timer: 100
        });
    },
    success: function(message) {
        $.notify({
            icon: "add_alert",
            message: message
        }, {
            type: "success",
            timer: 1000
        });
    },
    warning: function(message) {
        $.notify({
            icon: "add_alert",
            message: message
        }, {
            type: "warning",
            timer: 1000
        });
    },
    initLoding: function() {
        $(".content").mLoading({
            text:"loading...",
            mask:false
        });
    },
    loading: function () {
        this.initLoding()
        $(".content").mLoading("show");
    },
    closeLoading:function () {
        $(".content").mLoading("hide");
    }
}