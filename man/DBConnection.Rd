% Generated by roxygen2: do not edit by hand
% Please edit documentation in R/DBConnection.r
\name{DBConnection}
\alias{DBConnection}
\title{DBConnection Class}
\description{
DBConnection Class

DBConnection Class
}
\section{Public fields}{
\if{html}{\out{<div class="r6-fields">}}
\describe{
\item{\code{can}}{}

\item{\code{name}}{}

\item{\code{dialect}}{}

\item{\code{snippets}}{}

\item{\code{pdts_enabled}}{}

\item{\code{host}}{}

\item{\code{port}}{}

\item{\code{username}}{}

\item{\code{password}}{}

\item{\code{uses_oauth}}{}

\item{\code{certificate}}{}

\item{\code{file_type}}{}

\item{\code{database}}{}

\item{\code{db_timezone}}{}

\item{\code{query_timezone}}{}

\item{\code{schema}}{}

\item{\code{max_connections}}{}

\item{\code{max_billing_gigabytes}}{}

\item{\code{ssl}}{}

\item{\code{verify_ssl}}{}

\item{\code{tmp_db_name}}{}

\item{\code{jdbc_additional_params}}{}

\item{\code{pool_timeout}}{}

\item{\code{dialect_name}}{}

\item{\code{created_at}}{}

\item{\code{user_id}}{}

\item{\code{example}}{}

\item{\code{user_db_credentials}}{}

\item{\code{user_attribute_fields}}{}

\item{\code{maintenance_cron}}{}

\item{\code{last_regen_at}}{}

\item{\code{last_reap_at}}{}

\item{\code{sql_runner_precache_tables}}{}

\item{\code{sql_writing_with_info_schema}}{}

\item{\code{after_connect_statements}}{}

\item{\code{pdt_context_override}}{}

\item{\code{managed}}{}

\item{\code{tunnel_id}}{}

\item{\code{pdt_concurrency}}{}

\item{\code{disable_context_comment}}{}

\item{\code{oauth_application_id}}{}

\item{\code{always_retry_failed_builds}}{}
}
\if{html}{\out{</div>}}
}
\section{Methods}{
\subsection{Public methods}{
\itemize{
\item \href{#method-new}{\code{DBConnection$new()}}
\item \href{#method-toJSON}{\code{DBConnection$toJSON()}}
\item \href{#method-fromJSONObject}{\code{DBConnection$fromJSONObject()}}
\item \href{#method-fromJSON}{\code{DBConnection$fromJSON()}}
\item \href{#method-toJSONString}{\code{DBConnection$toJSONString()}}
\item \href{#method-fromJSONString}{\code{DBConnection$fromJSONString()}}
\item \href{#method-clone}{\code{DBConnection$clone()}}
}
}
\if{html}{\out{<hr>}}
\if{html}{\out{<a id="method-new"></a>}}
\if{latex}{\out{\hypertarget{method-new}{}}}
\subsection{Method \code{new()}}{
\subsection{Usage}{
\if{html}{\out{<div class="r">}}\preformatted{DBConnection$new(
  can,
  name,
  dialect,
  snippets,
  pdts_enabled,
  host,
  port,
  username,
  password,
  uses_oauth,
  certificate,
  file_type,
  database,
  db_timezone,
  query_timezone,
  schema,
  max_connections,
  max_billing_gigabytes,
  ssl,
  verify_ssl,
  tmp_db_name,
  jdbc_additional_params,
  pool_timeout,
  dialect_name,
  created_at,
  user_id,
  example,
  user_db_credentials,
  user_attribute_fields,
  maintenance_cron,
  last_regen_at,
  last_reap_at,
  sql_runner_precache_tables,
  sql_writing_with_info_schema,
  after_connect_statements,
  pdt_context_override,
  managed,
  tunnel_id,
  pdt_concurrency,
  disable_context_comment,
  oauth_application_id,
  always_retry_failed_builds
)}\if{html}{\out{</div>}}
}

}
\if{html}{\out{<hr>}}
\if{html}{\out{<a id="method-toJSON"></a>}}
\if{latex}{\out{\hypertarget{method-toJSON}{}}}
\subsection{Method \code{toJSON()}}{
\subsection{Usage}{
\if{html}{\out{<div class="r">}}\preformatted{DBConnection$toJSON()}\if{html}{\out{</div>}}
}

}
\if{html}{\out{<hr>}}
\if{html}{\out{<a id="method-fromJSONObject"></a>}}
\if{latex}{\out{\hypertarget{method-fromJSONObject}{}}}
\subsection{Method \code{fromJSONObject()}}{
\subsection{Usage}{
\if{html}{\out{<div class="r">}}\preformatted{DBConnection$fromJSONObject(DBConnectionJsonObject)}\if{html}{\out{</div>}}
}

}
\if{html}{\out{<hr>}}
\if{html}{\out{<a id="method-fromJSON"></a>}}
\if{latex}{\out{\hypertarget{method-fromJSON}{}}}
\subsection{Method \code{fromJSON()}}{
\subsection{Usage}{
\if{html}{\out{<div class="r">}}\preformatted{DBConnection$fromJSON(DBConnectionJson)}\if{html}{\out{</div>}}
}

}
\if{html}{\out{<hr>}}
\if{html}{\out{<a id="method-toJSONString"></a>}}
\if{latex}{\out{\hypertarget{method-toJSONString}{}}}
\subsection{Method \code{toJSONString()}}{
\subsection{Usage}{
\if{html}{\out{<div class="r">}}\preformatted{DBConnection$toJSONString()}\if{html}{\out{</div>}}
}

}
\if{html}{\out{<hr>}}
\if{html}{\out{<a id="method-fromJSONString"></a>}}
\if{latex}{\out{\hypertarget{method-fromJSONString}{}}}
\subsection{Method \code{fromJSONString()}}{
\subsection{Usage}{
\if{html}{\out{<div class="r">}}\preformatted{DBConnection$fromJSONString(DBConnectionJson)}\if{html}{\out{</div>}}
}

}
\if{html}{\out{<hr>}}
\if{html}{\out{<a id="method-clone"></a>}}
\if{latex}{\out{\hypertarget{method-clone}{}}}
\subsection{Method \code{clone()}}{
The objects of this class are cloneable with this method.
\subsection{Usage}{
\if{html}{\out{<div class="r">}}\preformatted{DBConnection$clone(deep = FALSE)}\if{html}{\out{</div>}}
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
