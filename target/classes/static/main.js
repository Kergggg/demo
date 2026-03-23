window.onload = function(){
    $(".like").click((e) => {
        alert("debug^ button text: " + e.currentTarget.innerText);
    });
    var btn = $(e.currentTarget);
    var postId = btn.attr("data-post-id");
    btn.attr("disabled", "disabled");
    $.post("/post/" + postId + "/like", (data) => {
       btn.text("" + data + " ❤");
       btn.removeClass("btn-secondary");
       btn.addClass("btn-danger");
    });
}
