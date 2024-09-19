---
title: vue3-element-plus-admin
language_tabs:
  - shell: Shell
  - http: HTTP
  - javascript: JavaScript
  - ruby: Ruby
  - python: Python
  - php: PHP
  - java: Java
  - go: Go
toc_footers: []
includes: []
search: true
code_clipboard: true
highlight_theme: darkula
headingLevel: 2
generator: "@tarslib/widdershins v4.0.23"

---

# vue3-element-plus-admin

Base URLs:

# Authentication

# 信息管理

## GET 信息详情

GET /api/news/detailed

### 请求参数

|名称|位置|类型|必选|说明|
|---|---|---|---|---|
|id|query|integer| 否 |ID 编号|

> 返回示例

```json
{
  "message": "SUCCESS",
  "resCode": 0,
  "data": {
    "id": 35,
    "category_id": 29,
    "content": "<p>f f </p>",
    "create_date": "2021-09-25 21:50:02",
    "image_url": "http://qv18xxim7.hn-bkt.clouddn.com/9-20.jpg",
    "status": "1",
    "title": "vvv"
  }
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|Inline|

### 返回数据结构

状态码 **200**

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|» message|string|true|none|消息|none|
|» resCode|integer|true|none|业务状态码|none|
|» data|object|true|none|数据集合|none|
|»» id|integer|true|none|信息ID|none|
|»» category_id|integer|true|none|类别ID|none|
|»» content|string|true|none|内容|none|
|»» create_date|string|true|none|发布日期|none|
|»» image_url|string|true|none|缩略图|none|
|»» status|string|true|none|发布状态|1：是，0：否|
|»» title|string|true|none|标题|none|

## POST 信息编辑

POST /api/news/editInfo

> Body 请求参数

```json
{
  "id": 20,
  "image_url": "http://file.web-jshtml.cn/uploads/9-30.jpg",
  "category_id": 51,
  "title": "ff",
  "create_date": "2021-09-21 14:46:55",
  "content": "<p>fff</p>",
  "status": "1"
}
```

### 请求参数

|名称|位置|类型|必选|中文名|说明|
|---|---|---|---|---|---|
|body|body|object| 否 ||none|
|» id|body|integer| 是 | 信息ID|none|
|» title|body|string| 是 | 标题|none|
|» image_url|body|string| 是 | 缩略图|none|
|» category_id|body|integer| 是 | 类别ID|none|
|» status|body|string| 是 | 是否发布|1：是，0：否|
|» content|body|string| 是 | 内容|none|
|» create_date|body|string| 是 | 日期|none|

> 返回示例

> 200 Response

```json
{
  "message": "string",
  "resCode": 0,
  "data": null
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|Inline|

### 返回数据结构

状态码 **200**

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|» message|string|true|none|消息|none|
|» resCode|integer|true|none|业务状态码|none|
|» data|null|true|none|数据|none|

## POST 发布状态

POST /api/news/status

> Body 请求参数

```json
{
  "id": 31,
  "status": true
}
```

### 请求参数

|名称|位置|类型|必选|中文名|说明|
|---|---|---|---|---|---|
|body|body|object| 否 ||none|
|» id|body|integer| 是 | 信息ID|none|
|» status|body|boolean| 是 | 发布状态|true：是，false：否|

> 返回示例

> 200 Response

```json
{
  "message": "string",
  "resCode": 0,
  "data": null
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|Inline|

### 返回数据结构

状态码 **200**

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|» message|string|true|none|消息|none|
|» resCode|integer|true|none|业务状态码|none|
|» data|null|true|none|数据|none|

## DELETE 信息删除

DELETE /api/news/delete

### 请求参数

|名称|位置|类型|必选|中文名|说明|
|---|---|---|---|---|---|
|categoryId|query|integer| 是 ||信息ID|

> 返回示例

```json
{
  "message": "删除成功",
  "resCode": 0,
  "data": ""
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|Inline|

### 返回数据结构

状态码 **200**

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|» message|string|true|none|消息|none|
|» resCode|integer|true|none|业务状态码|none|
|» data|null|true|none|数据|none|

## POST 信息列表

POST /api/news/getList

> Body 请求参数

```json
{
  "pageNumber": 1,
  "pageSize": 10,
  "status": "1",
  "title": "vue3",
  "id": 20
}
```

### 请求参数

|名称|位置|类型|必选|中文名|说明|
|---|---|---|---|---|---|
|body|body|object| 否 ||none|
|» pageNumber|body|integer| 是 | 页码|1|
|» pageSize|body|integer| 是 | 数量|10|
|» status|body|string| 否 | 发布状态|1：是，0：否|
|» title|body|string| 否 | 标题|关键字|
|» id|body|integer| 否 | id|关键字|

> 返回示例

```json
{
  "message": "SUCCESS",
  "resCode": 0,
  "data": {
    "total": 2,
    "per_page": 10,
    "current_page": 1,
    "last_page": 1,
    "data": [
      {
        "title": "fff ",
        "status": true,
        "image_url": "http://qv18xxim7.hn-bkt.clouddn.com/9-27.jpg",
        "id": 19,
        "datetime": 1632267282,
        "category_name": "ff"
      },
      {
        "title": "ff",
        "status": false,
        "image_url": null,
        "id": 18,
        "datetime": 1632267282,
        "category_name": "ff"
      }
    ]
  }
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|Inline|

### 返回数据结构

状态码 **200**

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|» message|string|true|none|消息|none|
|» resCode|integer|true|none|业务状态码|none|
|» data|object|true|none|数据|none|
|»» total|integer|true|none|总条数|none|
|»» per_page|integer|true|none||none|
|»» current_page|integer|true|none|当前页面|none|
|»» last_page|integer|true|none||none|
|»» data|[object]|true|none|数据集合|none|
|»»» title|string|true|none|信息标题|none|
|»»» status|boolean|true|none|发布状态|true：已发布，false：未发布|
|»»» image_url|string¦null|true|none|缩略图|none|
|»»» id|integer|true|none|信息ID|唯一标记、主键|
|»»» datetime|integer|true|none|发布日期|none|
|»»» category_name|string|true|none|分类名称|none|

## POST 信息添加

POST /api/news/add

> Body 请求参数

```json
{
  "image_url": "http://file.web-jshtml.cn/uploads/9-30.jpg",
  "category_id": 51,
  "title": "ff",
  "create_date": "2021-09-21 14:46:55",
  "content": "<p>fff</p>",
  "status": "1"
}
```

### 请求参数

|名称|位置|类型|必选|中文名|说明|
|---|---|---|---|---|---|
|body|body|object| 否 ||none|
|» image_url|body|string| 是 | 缩略图|none|
|» category_id|body|integer| 是 | 类别ID|none|
|» title|body|string| 是 | 标题|none|
|» create_date|body|string| 是 | 日期|none|
|» content|body|string| 否 | 内容|none|
|» status|body|string| 是 | 是否发布|1：是，0：否|

> 返回示例

```json
{
  "message": "创建成功",
  "resCode": 0,
  "data": ""
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|Inline|

### 返回数据结构

状态码 **200**

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|» message|string|true|none|消息|none|
|» resCode|integer|true|none|业务状态码|none|
|» data|null|true|none|数据|none|

# 公共资源

## POST 文件上传

POST /

> Body 请求参数

```yaml
files: ""

```

### 请求参数

|名称|位置|类型|必选|中文名|说明|
|---|---|---|---|---|---|
|body|body|object| 否 ||none|
|» files|body|string(binary)| 否 ||上传的文件|

> 返回示例

> 200 Response

```json
{
  "message": "string",
  "resCode": 0,
  "data": {
    "files_path": "string",
    "errors": 0
  }
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|Inline|

### 返回数据结构

状态码 **200**

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|» message|string|true|none|消息|none|
|» resCode|integer|true|none|业务状态码|none|
|» data|object|true|none|数据集合|none|
|»» files_path|string¦null|true|none|文件路径|none|
|»» errors|integer¦null|true|none|	 文件上传错误状态码|none|

## POST 获取七牛云toKen

POST /api/uploadImgToken

> Body 请求参数

```json
{
  "ak": "Avh-EZZAa4TxqPQZsEW42fXBUbTMFi-RKSTRJj",
  "sk": "l9AXtnhCVkZexXNRcmHXzmecXiCUiLynwGbMUw",
  "buckety": "bigbigtime"
}
```

### 请求参数

|名称|位置|类型|必选|中文名|说明|
|---|---|---|---|---|---|
|body|body|object| 否 ||none|
|» ak|body|string| 是 | 密钥 AccessKey|none|
|» sk|body|string| 是 | 密钥 SecertKey|none|
|» buckety|body|string| 是 | 空间名称|none|

> 返回示例

> 200 Response

```json
{
  "resCode": 0,
  "data": {
    "token": "string"
  },
  "message": "string"
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|Inline|

### 返回数据结构

状态码 **200**

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|» resCode|integer|true|none|业务状态码|none|
|» data|object|true|none|数据对象|none|
|»» token|string|true|none|七牛云 token|none|
|» message|string|true|none|消息|none|

# 分类管理

## DELETE 删除分类

DELETE /api/news/deleteCategory

### 请求参数

|名称|位置|类型|必选|中文名|说明|
|---|---|---|---|---|---|
|id|query|integer| 否 ||分类ID|

> 返回示例

```json
{
  "message": "删除成功",
  "resCode": 0,
  "data": null
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|Inline|

### 返回数据结构

状态码 **200**

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|» message|string|true|none|消息|none|
|» resCode|integer|true|none|业务状态码|非0：存在子级|
|» data|null|true|none|数据集合|none|

## POST 编辑分类

POST /api/news/editCategory

> Body 请求参数

```json
{
  "categoryName": "vue3.0",
  "id": 35
}
```

### 请求参数

|名称|位置|类型|必选|中文名|说明|
|---|---|---|---|---|---|
|body|body|object| 否 ||none|
|» categoryName|body|string| 是 | 分类名称|none|
|» id|body|integer| 是 | 分类ID|none|

> 返回示例

> 200 Response

```json
{
  "message": "string",
  "resCode": 0,
  "data": {
    "category_name": "string",
    "id": 0
  }
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|Inline|

### 返回数据结构

状态码 **200**

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|» message|string|true|none|消息|none|
|» resCode|integer|true|none|业务状态码|none|
|» data|object|true|none|数据集合|none|
|»» category_name|string|true|none|分类名称|none|
|»» id|integer|true|none|分类ID|none|

## POST 添加子级分类

POST /api/news/addChildrenCategory

> Body 请求参数

```json
{
  "categoryName": "3434",
  "parentId": 35
}
```

### 请求参数

|名称|位置|类型|必选|中文名|说明|
|---|---|---|---|---|---|
|body|body|object| 否 ||none|
|» categoryName|body|string| 是 | 分类名称|none|
|» parentId|body|integer| 是 | 父级分类ID|none|

> 返回示例

```json
{
  "message": "创建成功",
  "resCode": 0,
  "data": {
    "category_name": "3434",
    "parent_id": 35,
    "id": "60"
  }
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|Inline|

### 返回数据结构

状态码 **200**

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|» message|string|true|none|消息|none|
|» resCode|integer|true|none|业务状态码|none|
|» data|object|true|none|数据集合|none|
|»» category_name|string|true|none|分类名称|none|
|»» parent_id|integer|true|none|父级分类ID|none|
|»» id|string|true|none|当前添加分类的ID|唯一|

## GET 分类列表

GET /api/news/getCategoryAll

> 返回示例

> 200 Response

```json
{
  "message": "string",
  "resCode": 0,
  "data": [
    {
      "category_name": "string",
      "parent_id": null,
      "id": 0
    }
  ]
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|Inline|

### 返回数据结构

状态码 **200**

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|» message|string|true|none|消息|none|
|» resCode|integer|true|none|业务状态码|none|
|» data|[object]|true|none|数据集合|none|
|»» category_name|string|false|none|分类名称|none|
|»» parent_id|null|false|none|父级分类id|none|
|»» id|integer|false|none|分类id|none|

## POST 添加父级分类

POST /api/news/addFirstCategory

> Body 请求参数

```json
{
  "categoryName": "web前端技术"
}
```

### 请求参数

|名称|位置|类型|必选|中文名|说明|
|---|---|---|---|---|---|
|body|body|object| 否 ||none|
|» categoryName|body|string| 是 | 分类名称|none|

> 返回示例

```json
{
  "message": "创建成功",
  "resCode": 0,
  "data": ""
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Response](#schemaresponse)|

# 角色管理

## GET 角色列表（所有）

GET /api/role/all

> 返回示例

> 200 Response

```json
{
  "message": "string",
  "resCode": 0,
  "data": [
    {
      "role_name": "string",
      "role_id": 0
    }
  ]
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|Inline|

### 返回数据结构

状态码 **200**

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|» message|string|true|none||none|
|» resCode|integer|true|none||none|
|» data|[object]|true|none||none|
|»» role_name|string|true|none||none|
|»» role_id|integer|true|none||none|

## GET 角色详情

GET /api/role/detailed

### 请求参数

|名称|位置|类型|必选|中文名|说明|
|---|---|---|---|---|---|
|id|query|integer| 是 ||none|

> 返回示例

> 200 Response

```json
{
  "message": "string",
  "resCode": 0,
  "data": {
    "role_id": 0,
    "role_name": "string",
    "role_disabled": null,
    "menu_id": "string",
    "menu_elem": "string"
  }
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|Inline|

### 返回数据结构

状态码 **200**

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|» message|string|true|none|消息|none|
|» resCode|integer|true|none|业务状态码|none|
|» data|object|true|none|数据|none|
|»» role_id|integer|true|none|角色ID|none|
|»» role_name|string|true|none|角色名称|none|
|»» role_disabled|null|true|none|是否启用|1：是，2：否|
|»» menu_id|string|true|none|菜单ID|none|
|»» menu_elem|string|true|none|页面元素|none|

## POST 角色添加

POST /api/role/create

> Body 请求参数

```json
{
  "role_name": "超级管理员",
  "role_value": "admin",
  "role_disabled": "1",
  "menu_id": [
    1,
    2,
    3
  ]
}
```

### 请求参数

|名称|位置|类型|必选|中文名|说明|
|---|---|---|---|---|---|
|body|body|object| 否 ||none|
|» role_name|body|string| 是 | 角色名称|none|
|» role_value|body|string| 是 | 角色标识|none|
|» role_disabled|body|string| 是 | 是否启用|1：是，2：否|
|» menu_id|body|[integer]| 否 | 菜单id|[1, 2, 3]|
|» has_admin|body|string| 是 | 是否启用|1：是，0：否，默认 0|

> 返回示例

```json
{
  "message": "创建成功",
  "resCode": 0,
  "data": {
    "role_name": "超级管理员",
    "role_value": "admin"
  }
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|Inline|

### 返回数据结构

状态码 **200**

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|» message|string|true|none|消息|none|
|» resCode|integer|true|none|业务状态码|none|
|» data|object|true|none|数据|none|
|»» role_name|string|true|none|角色名称|none|
|»» role_value|string|true|none|角色标识|none|

## GET 角色列表

GET /api/role/lists

### 请求参数

|名称|位置|类型|必选|中文名|说明|
|---|---|---|---|---|---|
|pageNumber|query|integer| 否 ||当前页码，默认 1|
|pageSize|query|integer| 否 ||每页条数，默认 10|

> 返回示例

> 200 Response

```json
{
  "message": "string",
  "resCode": 0,
  "data": {
    "data": [
      {
        "role_id": 0,
        "role_name": "string",
        "user_id": null,
        "menu_id": "string",
        "role_value": null,
        "menu_elem": "string"
      }
    ]
  }
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|Inline|

### 返回数据结构

状态码 **200**

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|» message|string|true|none|消息|none|
|» resCode|integer|true|none|业务状态码|none|
|» data|object|true|none|数据集合|none|
|»» data|[object]|true|none|数据集合|none|
|»»» role_id|integer|false|none|角色ID|none|
|»»» role_name|string|false|none|角色名称|none|
|»»» user_id|null|false|none||none|
|»»» menu_id|string|false|none|菜单ID|1,2,3,4|
|»»» role_value|null|false|none|角色标识|none|
|»»» menu_elem|string|false|none|页面元素标识|info:add,info:edit|

# 菜单管理

## POST 菜单禁启用状态

POST /api/menu/statusDisabled

> Body 请求参数

```json
{
  "menu_id": 76,
  "menu_disabled": "2"
}
```

### 请求参数

|名称|位置|类型|必选|中文名|说明|
|---|---|---|---|---|---|
|body|body|object| 否 ||none|
|» menu_id|body|integer| 是 | 菜单ID|none|
|» menu_disabled|body|string| 是 | 是否禁用|1：是，2：否|

> 返回示例

> 200 Response

```json
{
  "message": "string",
  "resCode": 0,
  "data": "string"
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|Inline|

### 返回数据结构

状态码 **200**

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|» message|string|true|none|消息|none|
|» resCode|integer|true|none|业务状态码|none|
|» data|string|true|none|数据|none|

## POST 菜单隐藏状态

POST /api/menu/statusHidden

> Body 请求参数

```json
{
  "menu_id": 76,
  "menu_disabled": "2"
}
```

### 请求参数

|名称|位置|类型|必选|中文名|说明|
|---|---|---|---|---|---|
|body|body|object| 否 ||none|
|» menu_id|body|integer| 是 | 菜单ID|none|
|» menu_hidden|body|string| 是 | 隐藏状态|1：是，2：否|

> 返回示例

```json
{
  "message": "更新成功",
  "resCode": 0,
  "data": ""
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|Inline|

### 返回数据结构

状态码 **200**

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|» message|string|true|none|消息|none|
|» resCode|integer|true|none|业务状态码|none|
|» data|string|true|none|数据|none|

## POST 菜单编辑

POST /api/menu/update

> Body 请求参数

```json
{
  "menu_id": 10,
  "menu_name_cn": "111",
  "menu_name_en": "111",
  "router_name": "11",
  "component": "11",
  "icon": "",
  "sort": 10,
  "hidden": "1",
  "disabled": "1",
  "keep": "1",
  "redirect": "111",
  "lang": "en",
  "router_path": "2222"
}
```

### 请求参数

|名称|位置|类型|必选|中文名|说明|
|---|---|---|---|---|---|
|body|body|object| 否 ||none|
|» menu_id|body|integer| 是 | 菜单ID|none|
|» menu_name_cn|body|string| 是 | 菜单名称|中文|
|» menu_name_en|body|string| 是 | 菜单名称|英文|
|» router_name|body|string| 是 | 路由名称|none|
|» component|body|string| 是 | 映射组件|none|
|» icon|body|string| 否 | 图标|none|
|» sort|body|integer| 否 | 排序|none|
|» hidden|body|string| 否 | 隐藏菜单|1：是，0：否|
|» disabled|body|string| 否 | 是否禁启|1：是，0：否|
|» keep|body|string| 否 | 是否缓存|1：是，0：否|
|» redirect|body|string| 否 | 重定向|none|
|» lang|body|string| 否 | 语言|英文逗号间隔 cn, en|
|» router_path|body|string| 是 | 路由path|none|

> 返回示例

```json
{
  "msg": "success",
  "error_code": 0,
  "content": {
    "parent_id": "",
    "menu_name_cn": "11",
    "menu_name_en": "111",
    "router_name": "11",
    "router_path": "2222",
    "hidden": "1",
    "component": "11",
    "icon": "",
    "sort": 10,
    "keep": "1",
    "redirect": "111",
    "lang": "en",
    "user_id": 828,
    "create_time": "2021-07-21 21:14:30",
    "update_time": "2021-07-21 21:14:30",
    "menu_id": "30"
  },
  "log_id": "e86760a55fe020018622050085611439"
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|Inline|

### 返回数据结构

状态码 **200**

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|» msg|string|true|none||none|
|» error_code|integer|true|none||none|
|» content|object|true|none||none|
|»» parent_id|string|true|none||none|
|»» menu_name_cn|string|true|none||none|
|»» menu_name_en|string|true|none||none|
|»» router_name|string|true|none||none|
|»» router_path|string|true|none||none|
|»» hidden|string|true|none||none|
|»» component|string|true|none||none|
|»» icon|string|true|none||none|
|»» sort|integer|true|none||none|
|»» keep|string|true|none||none|
|»» redirect|string|true|none||none|
|»» lang|string|true|none||none|
|»» user_id|integer|true|none||none|
|»» create_time|string|true|none||none|
|»» update_time|string|true|none||none|
|»» menu_id|string|true|none||none|
|» log_id|string|true|none||none|

## GET 菜单详情

GET /api/menu/detailed

### 请求参数

|名称|位置|类型|必选|中文名|说明|
|---|---|---|---|---|---|
|menu_id|query|integer| 否 ||菜单ID|

> 返回示例

> 200 Response

```json
{
  "msg": "string",
  "error_code": 0,
  "content": {
    "menu_id": 0,
    "parent_id": 0,
    "menu_name_cn": "string",
    "menu_name_en": "string",
    "router_name": "string",
    "router_path": "string",
    "component": "string",
    "icon": "string",
    "sort": 0,
    "disabled": "string",
    "keep": "string",
    "redirect": "string",
    "lang": "string",
    "user_id": 0,
    "hidden": "string",
    "menu_fun": "string"
  },
  "log_id": "string"
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|Inline|

### 返回数据结构

状态码 **200**

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|» msg|string|true|none||none|
|» error_code|integer|true|none||none|
|» content|object|true|none||none|
|»» menu_id|integer|true|none|菜单ID|none|
|»» parent_id|integer|true|none|菜单父级ID|none|
|»» menu_name_cn|string|true|none|菜单中文名称|none|
|»» menu_name_en|string|true|none|菜单英文名称|none|
|»» router_name|string|true|none|路由名称|none|
|»» router_path|string|true|none|路由|none|
|»» component|string|true|none|映射组件|none|
|»» icon|string|true|none|图标|none|
|»» sort|integer|true|none|排序|none|
|»» disabled|string|true|none|是否禁用|1：是，0：否|
|»» keep|string|true|none|是否缓存|1：是，0：否|
|»» redirect|string|true|none|重定向路由|none|
|»» lang|string|true|none|语言|英文逗号间隔 cn, en|
|»» user_id|integer|true|none||none|
|»» hidden|string|true|none|隐藏菜单|1：是，0：否|
|»» menu_fun|string|true|none|页面元素权限|none|
|» log_id|string|true|none||none|

## DELETE 菜单删除

DELETE /api/menu/remove

### 请求参数

|名称|位置|类型|必选|中文名|说明|
|---|---|---|---|---|---|
|menu_id|query|integer| 否 ||菜单ID|

> 返回示例

```json
{
  "msg": "删除成功",
  "error_code": 0,
  "content": "",
  "log_id": "cc36fc25e00662cfab82759327937ef8"
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|Inline|

### 返回数据结构

状态码 **200**

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|» msg|string|true|none||none|
|» error_code|integer|true|none||none|
|» content|string|true|none||none|
|» log_id|string|true|none||none|

## GET 菜单列表

GET /api/menu/lists

> 返回示例

> 200 Response

```json
{}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|Inline|

### 返回数据结构

## GET 菜单列表（树形数据）

GET /api/menu/listsTree

> 返回示例

> 200 Response

```json
{}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|Inline|

### 返回数据结构

## POST 新增菜单

POST /api/menu/create

> Body 请求参数

```json
{
  "menu_name_cn": "本四件员者",
  "menu_name_en": "文此治眼想音采",
  "router_path": "cupidatat",
  "router_name": "头军照行",
  "component": "tempor labore ut in",
  "icon": "http://dummyimage.com/100x100",
  "sort": 30,
  "disabled": "nulla",
  "hidden": "93",
  "keep": "quis",
  "redirect": "in esse incididunt",
  "menu_fun": "cillum irure sed",
  "lang": "sed",
  "parent_id": "78"
}
```

### 请求参数

|名称|位置|类型|必选|中文名|说明|
|---|---|---|---|---|---|
|body|body|object| 否 ||none|
|» menu_name_cn|body|string| 是 ||菜单中文|
|» menu_name_en|body|string| 是 ||菜单英文|
|» router_path|body|string| 是 ||路由path|
|» router_name|body|string| 是 ||路由名称|
|» component|body|string| 是 ||组件路径|
|» icon|body|string| 否 ||菜单图标|
|» sort|body|integer| 否 ||排序|
|» disabled|body|string| 否 | 是否禁启|1：是，0：否，默认 0|
|» hidden|body|string| 否 | 隐藏菜单|1：是，0：否，默认 0|
|» keep|body|string| 否 | 是否缓存|1：是，0：否，默认 0|
|» redirect|body|string| 否 | 重定向|none|
|» menu_fun|body|string| 否 | 页面元素功能|none|
|» lang|body|string| 否 | 语言|英文逗号间隔 cn, en，默认 cn|
|» parent_id|body|string| 否 | 父级分类id|默认 0|

> 返回示例

```json
{
  "message": "success",
  "resCode": 0,
  "data": {
    "parent_id": "",
    "menu_name": "f ",
    "menu_path": "f ",
    "menu_router": "f ",
    "menu_hidden": "2",
    "menu_disabled": "2",
    "menu_component": "f ",
    "menu_icon": "",
    "menu_sort": 0,
    "menu_keep": "2",
    "menu_redirect": "",
    "menu_fun": "[{'value':'f','label':'f'}]",
    "user_id": 1070,
    "create_time": "2021-10-12 22:16:56",
    "update_time": "2021-10-12 22:16:56",
    "menu_id": "99"
  }
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|Inline|

### 返回数据结构

状态码 **200**

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|» message|string|true|none|消息|none|
|» resCode|integer|true|none|业务状态码|none|
|» data|object|true|none|数据|none|
|»» menu_id|integer|true|none|菜单ID|none|
|»» parent_id|integer|true|none|父级菜单ID|none|
|»» menu_name_cn|string|true|none|菜单中文|none|
|»» menu_name_en|string|true|none|菜单英文|none|
|»» router_path|string|true|none|路由path|none|
|»» router_name|string|true|none|路由名称|none|
|»» hidden|string|true|none|隐藏菜单|1：是，0：否|
|»» disabled|string|true|none|是否禁启|1：是，0：否|
|»» component|string|true|none|映射组件|none|
|»» icon|string|true|none|图标|none|
|»» sort|integer|true|none|排序|none|
|»» keep|string|true|none|是否缓存|1：是，0：否|
|»» redirect|string|true|none|重定向|none|
|»» menu_fun|string|true|none|页面元素功能|none|
|»» user_id|integer|true|none||none|
|»» create_time|string|true|none|创建日期|none|
|»» update_time|string|true|none|修改时间|none|
|»» lang|string|true|none|语言|none|

# 用户管理

## GET 获取用户权限

GET /api/user/permission

> 返回示例

> 200 Response

```json
{
  "message": "string",
  "resCode": 0,
  "data": {
    "router_menu": [
      {
        "menu_component": "string",
        "menu_hidden": "string",
        "menu_icon": "string",
        "menu_id": 0,
        "menu_keep": "string",
        "menu_name": "string",
        "menu_path": "string",
        "menu_redirect": "string",
        "menu_router": "string",
        "parent_id": 0
      }
    ],
    "elem_data": "string",
    "user": "string"
  }
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|Inline|

### 返回数据结构

状态码 **200**

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|» message|string|true|none|消息|none|
|» resCode|integer|true|none|业务状态码|none|
|» data|object|true|none||none|
|»» router_menu|[object]|true|none|路由菜单集合|none|
|»»» menu_component|string|true|none|组件|none|
|»»» menu_hidden|string|true|none|是否隐藏|1：是，2：否|
|»»» menu_icon|string|true|none|菜单图标|none|
|»»» menu_id|integer|true|none|菜单ID|none|
|»»» menu_keep|string|true|none|是否缓存页面|1：是，2：否|
|»»» menu_name|string|true|none|菜单名称|none|
|»»» menu_path|string|true|none|路由路径|none|
|»»» menu_redirect|string|true|none|是否重定向|1：是，2：否|
|»»» menu_router|string|true|none|路由名称|none|
|»»» parent_id|integer|true|none|父级菜单（路由）|none|
|»» elem_data|string|true|none|页面元素权限|none|
|»» user|string|false|none|用户类型|仅有管理员才会返回该字段|

## POST 添加用户

POST /api/user/create

> Body 请求参数

```json
{
  "username": "409019683@qq.com",
  "truename": "qq",
  "password": "b0a5c59d95469ad94c1391e2575ca734a8b740eb",
  "user_disabled": "1",
  "role_type": 101
}
```

### 请求参数

|名称|位置|类型|必选|中文名|说明|
|---|---|---|---|---|---|
|body|body|object| 否 ||none|
|» username|body|string| 是 | 用户名|email格式|
|» truename|body|string| 是 | 真实姓名|none|
|» password|body|string| 是 | 密码|sha1加密|
|» user_disabled|body|string| 是 | 是否启用|1：是，2：否|
|» role_type|body|integer| 是 | 角色类型|none|

> 返回示例

> 200 Response

```json
{
  "message": "string",
  "resCode": 0,
  "data": {
    "user": true
  }
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|Inline|

### 返回数据结构

状态码 **200**

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|» message|string|true|none|消息|none|
|» resCode|integer|true|none|业务状态码|none|
|» data|object|true|none|数据|none|
|»» user|boolean|true|none|用户添加状态|true：添加成功，false：添加失败|

## POST 用户状态更新`

POST /api/user/status

> Body 请求参数

```json
{
  "member_id": 0,
  "status": true
}
```

### 请求参数

|名称|位置|类型|必选|中文名|说明|
|---|---|---|---|---|---|
|body|body|object| 否 ||none|
|» member_id|body|integer| 是 | 用户ID|none|
|» status|body|boolean| 是 | 状态|true：启用，false：禁用|

> 返回示例

> 200 Response

```json
{
  "message": "string",
  "resCode": 0,
  "data": {}
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|[Response](#schemaresponse)|

## DELETE 用户删除

DELETE /api/user/remove

### 请求参数

|名称|位置|类型|必选|中文名|说明|
|---|---|---|---|---|---|
|member_id|query|integer| 否 ||会员ID|

> 返回示例

> 200 Response

```json
{}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|Inline|

### 返回数据结构

## POST 用户编辑

POST /api/user/update

> Body 请求参数

```json
{
  "member_id": "string",
  "username": "string",
  "truename": "string",
  "phone": "string",
  "password": "string",
  "care_id": "string",
  "role": "string",
  "status": true
}
```

### 请求参数

|名称|位置|类型|必选|中文名|说明|
|---|---|---|---|---|---|
|body|body|object| 否 ||none|
|» member_id|body|string| 是 | 会员ID|none|
|» username|body|string| 否 | 用户名|none|
|» truename|body|string| 否 | 真实姓名|none|
|» phone|body|string| 是 | 手机号|none|
|» password|body|string| 否 | 密码|加密|
|» care_id|body|string| 否 | 身份证|none|
|» role|body|string| 是 | 角色类型|none|
|» status|body|boolean| 是 | 状态|true：启用，false：禁用|

> 返回示例

> 200 Response

```json
{}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|Inline|

### 返回数据结构

## GET 用户详情

GET /api/user/info

### 请求参数

|名称|位置|类型|必选|中文名|说明|
|---|---|---|---|---|---|
|member_id|query|integer| 否 ||会员ID|

> 返回示例

> 200 Response

```json
{
  "message": "string",
  "resCode": 0,
  "data": {
    "member_id": "string",
    "phone": "string",
    "status": "string",
    "truename": "string",
    "username": "string",
    "card_id": "string",
    "role": "string"
  }
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|Inline|

### 返回数据结构

状态码 **200**

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|» message|string|true|none|消息|none|
|» resCode|integer|true|none|业务状态码|none|
|» data|object¦null|true|none|数据集合|none|
|»» member_id|string|true|none|会员ID|none|
|»» phone|string|true|none|手机号|none|
|»» status|string|true|none|状态|true：启用，false：禁用|
|»» truename|string|true|none|真实姓名|none|
|»» username|string|true|none|用户名|none|
|»» card_id|string|true|none|身份证|none|
|»» role|string|true|none|角色类型|none|

## POST 用户列表

POST /api/user/lists

> Body 请求参数

```json
{
  "username": "string",
  "phone": "string",
  "truename": "string",
  "pageSize": "string",
  "pageNumber": "string",
  "user_disabled": true
}
```

### 请求参数

|名称|位置|类型|必选|中文名|说明|
|---|---|---|---|---|---|
|body|body|object| 否 ||none|
|» username|body|string| 否 | 用户名|none|
|» phone|body|string| 否 | 手机号|none|
|» truename|body|string| 否 | 真实姓名|none|
|» pageSize|body|string| 是 | 每页条数|默认 10|
|» pageNumber|body|string| 是 | 当前页码|默认 1|
|» user_disabled|body|boolean| 否 | 禁启用|1：启用，0：禁用|

> 返回示例

> 200 Response

```json
{
  "message": "string",
  "resCode": 0,
  "data": {
    "total": 0,
    "per_page": 0,
    "current_page": 0,
    "last_page": 0,
    "data": [
      {
        "id": 0,
        "username": "string",
        "user_disabled": true,
        "truename": null,
        "user_createtime": null,
        "role_type": null
      }
    ]
  }
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|Inline|

### 返回数据结构

状态码 **200**

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|» message|string|true|none|消息|none|
|» resCode|integer|true|none|业务状态码|none|
|» data|object|true|none|数据对象|none|
|»» total|integer|true|none|总条数|none|
|»» per_page|integer|true|none||none|
|»» current_page|integer|true|none|当前页码|none|
|»» last_page|integer|true|none||none|
|»» data|[object]|true|none|数据集合|none|
|»»» id|integer|false|none|用户ID|none|
|»»» username|string|false|none|用户名|none|
|»»» user_disabled|boolean|false|none|用户状态|true：启用、false：禁用|
|»»» truename|null|false|none|真实姓名|none|
|»»» user_createtime|null|false|none|创建日期|none|
|»»» role_type|null|false|none|角色类型|none|

# 帐户体系

## GET http异常演示

GET /api/error

> 返回示例

> 200 Response

```json
{
  "message": "string",
  "resCode": 0,
  "data": null
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|Inline|

### 返回数据结构

状态码 **200**

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|» message|string|true|none||none|
|» resCode|integer|true|none||none|
|» data|null|true|none||none|

## POST 帐户登录

POST /api/login

> Body 请求参数

```json
{
  "username": "409019683@qq.com",
  "password": "b0a5c59d95469ad94c1391e2575ca734a8b740eb",
  "code": "513973"
}
```

### 请求参数

|名称|位置|类型|必选|中文名|说明|
|---|---|---|---|---|---|
|body|body|object| 否 ||none|
|» username|body|string| 是 | 用户名|none|
|» password|body|string| 是 | 密码|sha1加密|
|» code|body|string| 是 | 验证码|none|

> 返回示例

> 200 Response

```json
{
  "message": "string",
  "resCode": 0,
  "data": {
    "username": "string",
    "token": "string"
  }
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|Inline|

### 返回数据结构

状态码 **200**

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|» message|string|true|none|消息|none|
|» resCode|integer|true|none|业务状态码|none|
|» data|object|true|none|数据集合|none|
|»» username|string|true|none|用户名|none|
|»» token|string|true|none|token令牌|none|

## POST 帐户注册

POST /api/register

> Body 请求参数

```json
{
  "username": "409019683@qq.com",
  "password": "b0a5c59d95469ad94c1391e2575ca734a8b740eb",
  "code": "513973"
}
```

### 请求参数

|名称|位置|类型|必选|中文名|说明|
|---|---|---|---|---|---|
|body|body|object| 否 ||none|
|» username|body|string| 是 | 用户名|none|
|» password|body|string| 是 | 密码|sha1加密|
|» code|body|string| 是 | 验证码|none|

> 返回示例

```json
{
  "message": "登录成功",
  "resCode": 0,
  "data": {
    "username": "409019683@qq.com",
    "token": "c60e615b03ec367d3ce96ef6fac79101"
  }
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|Inline|

### 返回数据结构

状态码 **200**

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|» message|string|true|none|消息|none|
|» resCode|integer|true|none|业务状态码|none|
|» data|object|true|none|数据集合|none|
|»» user|boolean|true|none|用户名状态|已存在，false：不存在|
|»» username|string|true|none|用户名|none|
|»» token|string|true|none|token令牌|none|
|»» code|boolean|true|none|验证码|true：正确，false：不正确|

## GET 用户名检测

GET /api/account/check

### 请求参数

|名称|位置|类型|必选|中文名|说明|
|---|---|---|---|---|---|
|username|query|string| 否 ||用户名|

> 返回示例

> 200 Response

```json
{
  "message": "string",
  "resCode": 0,
  "data": {
    "user": true
  }
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|Inline|

### 返回数据结构

状态码 **200**

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|» message|string|true|none|消息|none|
|» resCode|integer|true|none|业务状态码|none|
|» data|object¦null|true|none|数据集合|none|
|»» user|boolean|true|none|用户状态|true：已存在，false：不存在|

## POST 获取验证码

POST /api/getCode

> Body 请求参数

```json
{
  "username": "409019683@qq.com",
  "module": "register"
}
```

### 请求参数

|名称|位置|类型|必选|中文名|说明|
|---|---|---|---|---|---|
|body|body|object| 否 ||none|
|» username|body|string| 否 | 用户名|none|
|» module|body|string| 是 | 验证码类型|login：登录，register：注册，忘记密码：forget|

> 返回示例

```json
{
  "message": "验证码发送成功。验证码：216410",
  "resCode": 0,
  "data": 216410
}
```

```json
{
  "message": "当前用户名已存在",
  "resCode": 1024,
  "data": ""
}
```

### 返回结果

|状态码|状态码含义|说明|数据模型|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|Inline|

### 返回数据结构

状态码 **200**

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|» message|string|true|none|消息|none|
|» resCode|integer|true|none|业务状态码|00|
|» data|string|true|none|验证码|none|

# 数据模型

<h2 id="tocS_Response">Response</h2>

<a id="schemaresponse"></a>
<a id="schema_Response"></a>
<a id="tocSresponse"></a>
<a id="tocsresponse"></a>

```json
{
  "message": "string",
  "resCode": 0,
  "data": {}
}

```

消息

### 属性

|名称|类型|必选|约束|中文名|说明|
|---|---|---|---|---|---|
|message|string|true|none|消息|none|
|resCode|integer|true|none|业务状态码|none|
|data|object¦null|true|none|数据集合|none|

