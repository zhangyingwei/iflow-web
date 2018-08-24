var app = new Vue({
    el: '#login-form',
    data: {
        username: "",
        password: ""
    },
    methods: {
        submit: function(){
            if (this.valid()) {
                $("#loginform").submit();
            }
        },
        valid: function () {
            if (!this.username) {
                util.danger("用户名不能为空 !")
                return false;
            }
            if (!this.password) {
                util.danger("密码不能为空 !")
                return false;
            }
            return true;
        }
    },
    mounted: function(){
        var msg = $("#msg").text().trim()
        if (msg){
            util.warning(msg)
        }
    }
})