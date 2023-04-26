/**
 * 
 */
const button = document.getElementById("button-menu");
const nav = document.getElementById("links");

button.addEventListener("click", () => {
  nav.classList.toggle("active");
});
