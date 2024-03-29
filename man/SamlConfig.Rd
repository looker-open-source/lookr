% Generated by roxygen2: do not edit by hand
% Please edit documentation in R/SamlConfig.r
\name{SamlConfig}
\alias{SamlConfig}
\title{SamlConfig Class}
\description{
SamlConfig Class

SamlConfig Class
}
\section{Public fields}{
\if{html}{\out{<div class="r6-fields">}}
\describe{
\item{\code{can}}{}

\item{\code{enabled}}{}

\item{\code{idp_cert}}{}

\item{\code{idp_url}}{}

\item{\code{idp_issuer}}{}

\item{\code{idp_audience}}{}

\item{\code{allowed_clock_drift}}{}

\item{\code{user_attribute_map_email}}{}

\item{\code{user_attribute_map_first_name}}{}

\item{\code{user_attribute_map_last_name}}{}

\item{\code{new_user_migration_types}}{}

\item{\code{alternate_email_login_allowed}}{}

\item{\code{test_slug}}{}

\item{\code{modified_at}}{}

\item{\code{modified_by}}{}

\item{\code{default_new_user_roles}}{}

\item{\code{default_new_user_groups}}{}

\item{\code{default_new_user_role_ids}}{}

\item{\code{default_new_user_group_ids}}{}

\item{\code{set_roles_from_groups}}{}

\item{\code{groups_attribute}}{}

\item{\code{groups}}{}

\item{\code{groups_with_role_ids}}{}

\item{\code{auth_requires_role}}{}

\item{\code{user_attributes}}{}

\item{\code{user_attributes_with_ids}}{}

\item{\code{groups_finder_type}}{}

\item{\code{groups_member_value}}{}

\item{\code{bypass_login_page}}{}

\item{\code{allow_normal_group_membership}}{}

\item{\code{allow_roles_from_normal_groups}}{}

\item{\code{allow_direct_roles}}{}

\item{\code{url}}{}
}
\if{html}{\out{</div>}}
}
\section{Methods}{
\subsection{Public methods}{
\itemize{
\item \href{#method-new}{\code{SamlConfig$new()}}
\item \href{#method-toJSON}{\code{SamlConfig$toJSON()}}
\item \href{#method-fromJSONObject}{\code{SamlConfig$fromJSONObject()}}
\item \href{#method-fromJSON}{\code{SamlConfig$fromJSON()}}
\item \href{#method-toJSONString}{\code{SamlConfig$toJSONString()}}
\item \href{#method-fromJSONString}{\code{SamlConfig$fromJSONString()}}
\item \href{#method-clone}{\code{SamlConfig$clone()}}
}
}
\if{html}{\out{<hr>}}
\if{html}{\out{<a id="method-new"></a>}}
\if{latex}{\out{\hypertarget{method-new}{}}}
\subsection{Method \code{new()}}{
\subsection{Usage}{
\if{html}{\out{<div class="r">}}\preformatted{SamlConfig$new(
  can,
  enabled,
  idp_cert,
  idp_url,
  idp_issuer,
  idp_audience,
  allowed_clock_drift,
  user_attribute_map_email,
  user_attribute_map_first_name,
  user_attribute_map_last_name,
  new_user_migration_types,
  alternate_email_login_allowed,
  test_slug,
  modified_at,
  modified_by,
  default_new_user_roles,
  default_new_user_groups,
  default_new_user_role_ids,
  default_new_user_group_ids,
  set_roles_from_groups,
  groups_attribute,
  groups,
  groups_with_role_ids,
  auth_requires_role,
  user_attributes,
  user_attributes_with_ids,
  groups_finder_type,
  groups_member_value,
  bypass_login_page,
  allow_normal_group_membership,
  allow_roles_from_normal_groups,
  allow_direct_roles,
  url
)}\if{html}{\out{</div>}}
}

}
\if{html}{\out{<hr>}}
\if{html}{\out{<a id="method-toJSON"></a>}}
\if{latex}{\out{\hypertarget{method-toJSON}{}}}
\subsection{Method \code{toJSON()}}{
\subsection{Usage}{
\if{html}{\out{<div class="r">}}\preformatted{SamlConfig$toJSON()}\if{html}{\out{</div>}}
}

}
\if{html}{\out{<hr>}}
\if{html}{\out{<a id="method-fromJSONObject"></a>}}
\if{latex}{\out{\hypertarget{method-fromJSONObject}{}}}
\subsection{Method \code{fromJSONObject()}}{
\subsection{Usage}{
\if{html}{\out{<div class="r">}}\preformatted{SamlConfig$fromJSONObject(SamlConfigJsonObject)}\if{html}{\out{</div>}}
}

}
\if{html}{\out{<hr>}}
\if{html}{\out{<a id="method-fromJSON"></a>}}
\if{latex}{\out{\hypertarget{method-fromJSON}{}}}
\subsection{Method \code{fromJSON()}}{
\subsection{Usage}{
\if{html}{\out{<div class="r">}}\preformatted{SamlConfig$fromJSON(SamlConfigJson)}\if{html}{\out{</div>}}
}

}
\if{html}{\out{<hr>}}
\if{html}{\out{<a id="method-toJSONString"></a>}}
\if{latex}{\out{\hypertarget{method-toJSONString}{}}}
\subsection{Method \code{toJSONString()}}{
\subsection{Usage}{
\if{html}{\out{<div class="r">}}\preformatted{SamlConfig$toJSONString()}\if{html}{\out{</div>}}
}

}
\if{html}{\out{<hr>}}
\if{html}{\out{<a id="method-fromJSONString"></a>}}
\if{latex}{\out{\hypertarget{method-fromJSONString}{}}}
\subsection{Method \code{fromJSONString()}}{
\subsection{Usage}{
\if{html}{\out{<div class="r">}}\preformatted{SamlConfig$fromJSONString(SamlConfigJson)}\if{html}{\out{</div>}}
}

}
\if{html}{\out{<hr>}}
\if{html}{\out{<a id="method-clone"></a>}}
\if{latex}{\out{\hypertarget{method-clone}{}}}
\subsection{Method \code{clone()}}{
The objects of this class are cloneable with this method.
\subsection{Usage}{
\if{html}{\out{<div class="r">}}\preformatted{SamlConfig$clone(deep = FALSE)}\if{html}{\out{</div>}}
}

\subsection{Arguments}{
\if{html}{\out{<div class="arguments">}}
\describe{
\item{\code{deep}}{Whether to make a deep clone.}
}
\if{html}{\out{</div>}}
}
}
}
