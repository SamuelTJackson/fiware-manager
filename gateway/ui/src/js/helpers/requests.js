const { URL, URLSearchParams } = require('url');

export const buildQueryUrl = (params, url) => {
  let parsedURL = new URL(url)


  parsedURL.search = new URLSearchParams(params).toString();
  return parsedURL.toString()
}