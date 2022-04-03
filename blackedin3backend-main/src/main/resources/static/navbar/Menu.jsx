/*
CLASSNAME FEITO

CONFERIR LINKS href E style

Link definido, mas não usado
*/

import React from "react";
import "../assets/css/style.css";
import Logo from '../assets/img/BlackedinLogo.svg';

import { Link } from "react-router-dom";

export default function Menu() {
    return (

			<nav className="navbar navbar-dark navbar-expand-md navigation-clean-search">
				<div className="container">
					<a className="navbar-brand" href="Index.jsp">
						<img src={Logo} alt="logo Blackedin" />
					</a>

					<div className="collapse navbar-collapse" id="navcol-2">
						<ul className="navbar-nav">
							<li className="nav-item"></li>
						</ul>
						<form className="form-inline mr-auto" target="_self">
							<div className="form-group mb-0">
								<label for="search-field"></label>
							</div>
						</form>
						<span className="navbar-text"> </span>
					</div>

					<a className="btn action-button" role="button" href="login.jsp">Login</a>
					<div className="dropdown">
						<button className="dropdown-toggle btn-cadastre-se" type="button"
							id="dropdownMenuButton1" data-bs-toggle="dropdown"
							aria-expanded="false">Cadastre-se</button>
						<ul className="dropdown-menu" aria-labelledby="dropdownMenuButton1">
							<li><a className="dropdown-item" href="CadastroProfissional.jsp">Profissional</a></li>
							<li><a className="dropdown-item" href="CadastroEmpresa.jsp">Empresa</a></li>
						</ul>
					</div>
				</div>
			</nav>

	);
}
