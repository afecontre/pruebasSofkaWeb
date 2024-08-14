chrome.webRequest.onBeforeSendHeaders.addListener(
    function(details) {
        console.log("Adding bypassRC header");
        details.requestHeaders.push({name: "bypassRC", value: "8b0ab38939b7c2c9"});
        return {requestHeaders: details.requestHeaders};
    },
    {urls: ["*://*/*"]},
    ["blocking", "requestHeaders"]
);
