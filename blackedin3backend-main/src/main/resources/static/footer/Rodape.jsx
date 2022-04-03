/*
CLASSNAME FEITO

CONFERIR LINKS href E style
*/

import React from "react";

export default function Rodape() {
    return (
        <>
			<footer className="footer-basic">

				<div className="social">
					<a href="#linkedin"><i className="icon bi bi-linkedin"></i></a>
					<a href="#facebook"><i className="icon bi bi-facebook"></i></a>
					<a href="#instagram"><i className="icon bi bi-instagram"></i></a>
					<a href="#pinterest"><i className="icon bi bi-pinterest"></i></a>
				</div>

				<ul className="list-inline">
					<li className="list-inline-item"><a href="Index.jsp">Home</a></li>
					<li className="list-inline-item"><a href="Index.jsp#objetivos">Objetivos</a></li>
					<li className="list-inline-item"><a href="Index.jsp#funcionalidades">Funcionalidade</a></li>
					<li className="list-inline-item"><a href="Index.jsp#testemunhos">Testemunhos</a></li>
					<li className="list-inline-item"><a href="Index.jsp#time">Time</a></li>
				</ul>

				<p className="copyright">Blackedin © 2022</p>
			</footer>
		</>
    );
}