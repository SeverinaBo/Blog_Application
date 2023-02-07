function setLanguage(otherLanguage) {
    langQueryParam = `lang=${otherLanguage}`
    let url = window.location.href
    if (url.includes("lang="))
        url = url.replace(new RegExp("lang=[a-zA-Z]{2}","i"), langQueryParam)
    else if (url.includes("?"))
        url += `&${langQueryParam}`
    else
        url += `?${langQueryParam}`
    window.open(url,"_self")
}