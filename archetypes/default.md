---
title: "{{ title .TranslationBaseName }}" 
date: {{ .Date }}
#weight: {{ if (in (split .Path "/") "daily") }}{{ dateFormat "20060102" .Date }}{{ end }}
draft: false
#type: slide
#theme: white
description: ""
---
{{/* original title: replace .TranslationBaseName "-" " " */}}
